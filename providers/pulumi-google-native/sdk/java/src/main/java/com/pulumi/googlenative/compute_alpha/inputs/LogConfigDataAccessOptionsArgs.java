// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.LogConfigDataAccessOptionsLogMode;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigDataAccessOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigDataAccessOptionsArgs Empty = new LogConfigDataAccessOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logMode")
    private @Nullable Output<LogConfigDataAccessOptionsLogMode> logMode;

    public Optional<Output<LogConfigDataAccessOptionsLogMode>> logMode() {
        return Optional.ofNullable(this.logMode);
    }

    private LogConfigDataAccessOptionsArgs() {}

    private LogConfigDataAccessOptionsArgs(LogConfigDataAccessOptionsArgs $) {
        this.logMode = $.logMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigDataAccessOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigDataAccessOptionsArgs $;

        public Builder() {
            $ = new LogConfigDataAccessOptionsArgs();
        }

        public Builder(LogConfigDataAccessOptionsArgs defaults) {
            $ = new LogConfigDataAccessOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder logMode(@Nullable Output<LogConfigDataAccessOptionsLogMode> logMode) {
            $.logMode = logMode;
            return this;
        }

        public Builder logMode(LogConfigDataAccessOptionsLogMode logMode) {
            return logMode(Output.of(logMode));
        }

        public LogConfigDataAccessOptionsArgs build() {
            return $;
        }
    }

}
