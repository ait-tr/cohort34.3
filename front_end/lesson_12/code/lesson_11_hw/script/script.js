const employees = [
    { name: 'Alice', salary: 5000 },
    { name: 'Bob', salary: 6000 },
    { name: 'Charlie', salary: 4500 }
];

const task_1 = employees.map(({name, salary}) => {
    const newEmployee = {
        salary: salary * 2,
        name: name
    };
    return newEmployee;
});

const task_2 = employees.filter(({salary}) => salary > 5500);

// console.log(task_1);
// console.log(task_2);

const task_3 = employees.reduce((acc, elem) => acc + elem.salary, 0);

// console.log(task_3);

const task_4 = employees.map(({name, salary}) => ({
    name: name.toUpperCase(),
    salary: salary
}));

console.log(task_4);