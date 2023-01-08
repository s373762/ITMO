import re

# 1.
with open('tests1') as f:
    for i, x in enumerate(f.readlines(), start=1):
        test, res = x.split(';')

        print(f'{i}. ', len(re.findall(':-{\\\\', test)))

print('\n', '*' * 20, ' ' * 4, '*' * 20, ' ' * 4, '*' * 20, '\n')

# 2.
with open('tests2', encoding='UTF-8') as f:
    for i, x in enumerate(f.readlines(), start=1):
        test, res = x.split(';')

        rex = re.compile(r'(([01][0-9])|(2[0-3])):([0-5][0-9])(:[0-5][0-9])?')
        while rex.search(test):
            test = test.replace(rex.search(test).group().strip(), '(TBD)')

        print(f'{i}.', test)

print('\n', '*' * 20, ' ' * 4, '*' * 20, ' ' * 4, '*' * 20, '\n')

# 3.
with open('tests3') as f:
    for i, x in enumerate(f.readlines(), start=1):
        test, res = x.split(';')
        for num in re.findall(r'[0-9]+', test):
            test = test.replace(num, str(int(num) ** 2 * 4 - 7))

        print(f'{i}.', test)
