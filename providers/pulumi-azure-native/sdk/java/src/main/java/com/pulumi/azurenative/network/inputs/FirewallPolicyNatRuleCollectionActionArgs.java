// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyNatRuleCollectionActionType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyNatRuleCollectionAction.
 * 
 */
public final class FirewallPolicyNatRuleCollectionActionArgs extends ResourceArgs {

    public static final FirewallPolicyNatRuleCollectionActionArgs Empty = new FirewallPolicyNatRuleCollectionActionArgs();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,FirewallPolicyNatRuleCollectionActionType>> type;

    /**
     * @return The type of action.
     * 
     */
    public Optional<Output<Either<String,FirewallPolicyNatRuleCollectionActionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private FirewallPolicyNatRuleCollectionActionArgs() {}

    private FirewallPolicyNatRuleCollectionActionArgs(FirewallPolicyNatRuleCollectionActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyNatRuleCollectionActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyNatRuleCollectionActionArgs $;

        public Builder() {
            $ = new FirewallPolicyNatRuleCollectionActionArgs();
        }

        public Builder(FirewallPolicyNatRuleCollectionActionArgs defaults) {
            $ = new FirewallPolicyNatRuleCollectionActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,FirewallPolicyNatRuleCollectionActionType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of action.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,FirewallPolicyNatRuleCollectionActionType> type) {
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
        public Builder type(FirewallPolicyNatRuleCollectionActionType type) {
            return type(Either.ofRight(type));
        }

        public FirewallPolicyNatRuleCollectionActionArgs build() {
            return $;
        }
    }

}
