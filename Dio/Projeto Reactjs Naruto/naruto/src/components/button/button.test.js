import {screen, render} from '@testing-library/react';
import {Button} from './Button';

test('renders button with text', () => {
    render(<Button>text</Button>)

    const ButtonEl = screen.getByText('text');
   
    expect(ButtonEl).toBeInTheDocument();
});