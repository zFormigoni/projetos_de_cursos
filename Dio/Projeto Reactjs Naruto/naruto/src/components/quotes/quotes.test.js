import { render, screen, fireEvent} from "@testing-library/react";
import { Quotes } from "./Quotes"

const frase = 'test quote';
const autor = 'random speaker' 

test("render received quote, speaker and a button", () =>{
    render(<Quotes quote={frase} speaker={autor} />);

    const quoteEl = screen.getByText(frase);
    const speakerEl = screen.getByText(`- ${autor}`);
    const buttonEl = screen.getByRole('button');

    expect(quoteEl).toBeInTheDocument();
    expect(speakerEl).toBeInTheDocument();
    expect(buttonEl).toBeInTheDocument();
})

test('call a callback when button is pressed', () => {
    const callback = jest.fn();

    render(<Quotes quote={frase} speaker={autor} onUpdate={callback} />);

    const buttonEl = screen.getByRole('button');

    fireEvent.click(buttonEl);

    expect(callback).toHaveBeenCalledTimes(1);
})

