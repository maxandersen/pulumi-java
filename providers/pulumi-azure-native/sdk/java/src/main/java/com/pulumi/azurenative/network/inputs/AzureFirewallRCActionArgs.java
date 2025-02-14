// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.AzureFirewallRCActionType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the AzureFirewallRCAction.
 * 
 */
public final class AzureFirewallRCActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFirewallRCActionArgs Empty = new AzureFirewallRCActionArgs();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,AzureFirewallRCActionType>> type;

    /**
     * @return The type of action.
     * 
     */
    public Optional<Output<Either<String,AzureFirewallRCActionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private AzureFirewallRCActionArgs() {}

    private AzureFirewallRCActionArgs(AzureFirewallRCActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallRCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallRCActionArgs $;

        public Builder() {
            $ = new AzureFirewallRCActionArgs();
        }

        public Builder(AzureFirewallRCActionArgs defaults) {
            $ = new AzureFirewallRCActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,AzureFirewallRCActionType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,AzureFirewallRCActionType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(AzureFirewallRCActionType type) {
            return type(Either.ofRight(type));
        }

        public AzureFirewallRCActionArgs build() {
            return $;
        }
    }

}
