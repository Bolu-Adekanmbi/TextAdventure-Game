## Project Planning
- [ ] Create a character class that holds attributes for the character

- [ ] Work on the first adventure as a separate class

- [ ] Character moveSet based on character class 
    - [ ] Brainstorm of varying character classes and work on write-up documentation for this for additional readme file

- [ ] Need to Rearrange some classes that are currently in GameEntities package

## HUGE IDEA!!
- [ ] Have the character story be written progressively by AI as the user plays
    - Some sort of DnD like game where the dungeon master is replaced by an AI
    - (This is why I am separating all interactions as separate from the entity
        to potentially pass into the AI)
    - Need to figure out how to give the AI access to creating obstacles/campaigns/challenges, etc, as well as how to make sure that the AI remembers context of the entire story (not just what is happening right now) -> Maybe an actively generated list of things the user has done saved in a separate log-file that is passed into the LLM before executing


### Currently Thinking about
- [ ] Fix simulation test
- [ ] Need to re-design character architecture --> Potentially too many fields right now
- [ ] Need to provide proper documentation/instructions for the game and plan out the GUI


### Nice to haves (extra-stuff)
- [ ] Cooking - combining raw ingredients (similar to breath of the wild)
- [ ] Item crafting -> Craftin items based on raw materials
    - [ ] Need to brainstorm a crafting recipe book (might keep hidden from player??)
- [ ] GUI for displaying what is going on as well?
- [ ] Further Interactions such as boost (for teammates), heal, etc.

### Class implementations
- [ ] Linked List
- [ ] ArmourSet
    - ArmourSet is a linked list of pieces of armour
    - The set can be swapped out with another bundle and each new piece of armour should be worn from the new set
        - Maybe a hashmap would be better for this feature?
        - Re-assigning the head of the linkedlist to the new armourSet and wearing armour based on the name of the piece
        - With a linked list I need to make sure that there are no duplicate items in a set
    - Items from the armour should be interchangeable one at a time
        - The linked list should be able to get one item at a time