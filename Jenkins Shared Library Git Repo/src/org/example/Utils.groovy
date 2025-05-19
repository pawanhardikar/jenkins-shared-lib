package org.example


class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    void printEnv() {
        steps.echo "🔧 Environment: ${steps.env.ENVIRONMENT}"
    }
}