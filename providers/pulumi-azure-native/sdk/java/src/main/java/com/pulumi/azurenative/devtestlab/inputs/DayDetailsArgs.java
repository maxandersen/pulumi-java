// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a daily schedule.
 * 
 */
public final class DayDetailsArgs extends ResourceArgs {

    public static final DayDetailsArgs Empty = new DayDetailsArgs();

    /**
     * The time of day the schedule will occur.
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return The time of day the schedule will occur.
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    private DayDetailsArgs() {}

    private DayDetailsArgs(DayDetailsArgs $) {
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DayDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DayDetailsArgs $;

        public Builder() {
            $ = new DayDetailsArgs();
        }

        public Builder(DayDetailsArgs defaults) {
            $ = new DayDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param time The time of day the schedule will occur.
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time The time of day the schedule will occur.
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public DayDetailsArgs build() {
            return $;
        }
    }

}
