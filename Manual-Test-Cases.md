# Manual Test Cases - Lumina Project

## Module: User Registration

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-101 | Register with valid details | 1. Open registration page 2. Enter valid name, email, password 3. Click Register | User created, confirmation email sent |
| TC-102 | Register with existing email | 1. Enter email already in use 2. Complete other fields 3. Click Register | Error "Email already registered" |
| TC-103 | Register with invalid email | 1. Enter "test@.com" 2. Click Register | Error "Invalid email format" |
| TC-104 | Password strength validation | 1. Enter "123" as password 2. Click Register | Error "Password too weak" |

## Module: Login

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-201 | Login with valid credentials | 1. Enter valid email and password 2. Click Login button | Redirect to home page, welcome message displayed |
| TC-202 | Login with wrong password | 1. Enter correct email, wrong password 2. Click Login | Error "Invalid credentials" shown |
| TC-203 | Login with empty fields | 1. Leave email and password blank 2. Click Login | Validation messages appear |
| TC-204 | Login with unregistered email | 1. Enter email not registered 2. Enter any password 3. Click Login | Error "Account not found" |

## Module: Product Search

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-301 | Search with valid product name | 1. Type "blue dress" in search 2. Press Enter | Products matching "blue dress" displayed |
| TC-302 | Search with no results | 1. Type "xyz123nonexistent" 2. Press Enter | "No products found" message shown |
| TC-303 | Apply size filter | 1. Search for "dress" 2. Click filter "Size: M" | Only size M dresses shown |
| TC-304 | Apply price filter | 1. Search for "shoes" 2. Set price range £20-£50 | Products between £20-£50 shown |

## Module: Shopping Cart

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-401 | Add single item to cart | 1. Search product 2. Click "Add to Cart" | Cart count shows 1, success message appears |
| TC-402 | Add multiple quantities | 1. Add item to cart 2. Change quantity to 3 3. Click Update | Total price updates to 3x item price |
| TC-403 | Remove item from cart | 1. Add item to cart 2. Click "Remove" | Item removed, cart count decreases |
| TC-404 | Apply valid coupon | 1. Add items to cart 2. Enter "SAVE20" in coupon field 3. Click Apply | 20% discount applied to total |
| TC-405 | Apply invalid coupon | 1. Enter "WRONGCODE" 2. Click Apply | Error "Invalid coupon code" shown |

## Module: Checkout

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-501 | Guest checkout | 1. Add item to cart 2. Click Checkout as Guest 3. Enter address details 4. Select payment method | Order success page shown |
| TC-502 | Registered user checkout | 1. Login first 2. Add item to cart 3. Proceed to checkout 4. Select saved address | Order placed successfully |
| TC-503 | Invalid address format | 1. Enter incomplete address 2. Try to proceed | Error "Please enter valid address" |
| TC-504 | Payment failure handling | 1. Enter invalid card details 2. Click Pay | Error message shown, order not placed |

## Module: Order History

| TC ID | Test Scenario | Steps | Expected Result |
|-------|---------------|-------|-----------------|
| TC-601 | View order history | 1. Login 2. Go to "My Orders" | List of past orders displayed |
| TC-602 | View order details | 1. Click on any order | Order details with items and total shown |
| TC-603 | Cancel order | 1. Find order placed today 2. Click Cancel | Order status changes to "Cancelled" |
