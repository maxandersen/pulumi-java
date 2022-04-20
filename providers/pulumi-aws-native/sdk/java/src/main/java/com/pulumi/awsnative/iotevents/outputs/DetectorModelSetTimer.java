// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelSetTimer {
    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.&lt;variable-name&gt;`), and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
     */
    private final @Nullable String durationExpression;
    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
     */
    private final @Nullable Integer seconds;
    /**
     * The name of the timer.
     * 
     */
    private final String timerName;

    @CustomType.Constructor
    private DetectorModelSetTimer(
        @CustomType.Parameter("durationExpression") @Nullable String durationExpression,
        @CustomType.Parameter("seconds") @Nullable Integer seconds,
        @CustomType.Parameter("timerName") String timerName) {
        this.durationExpression = durationExpression;
        this.seconds = seconds;
        this.timerName = timerName;
    }

    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.&lt;variable-name&gt;`), and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
    */
    public Optional<String> durationExpression() {
        return Optional.ofNullable(this.durationExpression);
    }
    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
    */
    public Optional<Integer> seconds() {
        return Optional.ofNullable(this.seconds);
    }
    /**
     * The name of the timer.
     * 
    */
    public String timerName() {
        return this.timerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String durationExpression;
        private @Nullable Integer seconds;
        private String timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationExpression = defaults.durationExpression;
    	      this.seconds = defaults.seconds;
    	      this.timerName = defaults.timerName;
        }

        public Builder durationExpression(@Nullable String durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder timerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }        public DetectorModelSetTimer build() {
            return new DetectorModelSetTimer(durationExpression, seconds, timerName);
        }
    }
}
