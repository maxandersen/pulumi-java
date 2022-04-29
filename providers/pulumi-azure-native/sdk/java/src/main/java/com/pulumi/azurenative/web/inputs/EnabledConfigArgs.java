// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Enabled configuration.
 * 
 */
public final class EnabledConfigArgs extends ResourceArgs {

    public static final EnabledConfigArgs Empty = new EnabledConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private EnabledConfigArgs() {}

    private EnabledConfigArgs(EnabledConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnabledConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnabledConfigArgs $;

        public Builder() {
            $ = new EnabledConfigArgs();
        }

        public Builder(EnabledConfigArgs defaults) {
            $ = new EnabledConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled True if configuration is enabled, false if it is disabled and null if configuration is not set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True if configuration is enabled, false if it is disabled and null if configuration is not set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public EnabledConfigArgs build() {
            return $;
        }
    }

}
