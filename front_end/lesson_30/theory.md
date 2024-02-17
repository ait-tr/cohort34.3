В React вы можете передавать функции изменения состояния (state) в компоненты в качестве пропсов для обеспечения взаимодействия между родительским и дочерними компонентами. Вот пример, как это может быть сделано:

Допустим, у вас есть родительский компонент (`ParentComponent`), в котором находится состояние и функция для его изменения:

```tsx
import React, { useState } from 'react';
import ChildComponent from './ChildComponent';

function ParentComponent(){
  const [count, setCount] = useState<number>(0);

  const incrementCount = () => {
    setCount(count + 1);
  };

  const decrementCount = () => {
    setCount(count - 1);
  };

  return (
    <div>
      <p>Count: {count}</p>
      <ChildComponent increment={incrementCount} decrement={decrementCount} />
    </div>
  );
};

export default ParentComponent;
```

Затем у вас есть дочерний компонент (`ChildComponent`), который принимает функции для изменения состояния в качестве пропсов:

```tsx
import React from 'react';

interface ChildProps {
  increment: () => void;
  decrement: () => void;
}

function ChildComponent(){
  return (
    <div>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </div>
  );
};

export default ChildComponent;
```

В этом примере `ChildComponent` получает две функции (`increment` и `decrement`) в качестве пропсов и использует их для изменения состояния в родительском компоненте.

При использовании TypeScript важно правильно определить интерфейсы пропсов для обеспечения типовой безопасности и предотвращения возможных ошибок во время компиляции.