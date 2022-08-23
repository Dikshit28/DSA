'''6154. Amount of Time for Binary Tree to Be Infected
You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.

Each minute, a node becomes infected if:

The node is currently uninfected.
The node is adjacent to an infected node.
Return the number of minutes needed for the entire tree to be infected.
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


def amountOfTime(root, start):
    if not root:
        return 0
    if root.val == start:
        return 1
    return amountOfTime(root.left, start) + amountOfTime(root.right, start) + 1 if root.val != start else 0


root = [1, 5, 3, null, 4, 10, 6, 9, 2]
start = 3
print(amountOfTime(root, start))
