t = int(input())

for i in range(t):
    n, m = map(int, input().split())
    balls_remaining = m * 6
    runs_remaining = n - balls_remaining
    max_possible_runs = m * 6 * 6
    if runs_remaining <= 0 or max_possible_runs >= n:
        print("YES")
    else:
        print("NO")
