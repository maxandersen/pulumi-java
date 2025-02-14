// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.IPAccessControlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IP access control for live event input.
 * 
 */
public final class LiveEventInputAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveEventInputAccessControlArgs Empty = new LiveEventInputAccessControlArgs();

    /**
     * The IP access control properties.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<IPAccessControlArgs> ip;

    /**
     * @return The IP access control properties.
     * 
     */
    public Optional<Output<IPAccessControlArgs>> ip() {
        return Optional.ofNullable(this.ip);
    }

    private LiveEventInputAccessControlArgs() {}

    private LiveEventInputAccessControlArgs(LiveEventInputAccessControlArgs $) {
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveEventInputAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveEventInputAccessControlArgs $;

        public Builder() {
            $ = new LiveEventInputAccessControlArgs();
        }

        public Builder(LiveEventInputAccessControlArgs defaults) {
            $ = new LiveEventInputAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ip The IP access control properties.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<IPAccessControlArgs> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The IP access control properties.
         * 
         * @return builder
         * 
         */
        public Builder ip(IPAccessControlArgs ip) {
            return ip(Output.of(ip));
        }

        public LiveEventInputAccessControlArgs build() {
            return $;
        }
    }

}
