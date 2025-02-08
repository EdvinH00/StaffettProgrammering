# OmegaPoint Konditori

## Introduktion
**OmegaPoint Konditori** är ett växande konditori som behöver ett digitalt system för att hantera beställningar, bakningsprocesser, lagerhantering och rapportering. Systemet ska underlätta administrationen och säkerställa att kunder får sina beställningar i tid.

## Funktionalitet

### 1. Beställningshantering (Order Management)
**Beskrivning**  
Kunder ska kunna lägga beställningar på olika bakverk. Beställningarna ska lagras i systemet och kunna hanteras av konditoriets personal.

**Funktioner**
- **Lägga till beställning**: En kund kan beställa ett bakverk genom att ange produkt, antal och namn.
- **Visa alla beställningar**: Personal kan se en lista över aktuella beställningar.
- **Avbryta beställning**: Möjlighet att ta bort en beställning om kunden ändrar sig.

**Exempel på beställning**
```json
{
  "order_id": 1,
  "customer": "Anna Karlsson",
  "products": [
    {"name": "Prinsesstårta", "quantity": 1},
    {"name": "Chokladbiskvi", "quantity": 3}
  ]
}
