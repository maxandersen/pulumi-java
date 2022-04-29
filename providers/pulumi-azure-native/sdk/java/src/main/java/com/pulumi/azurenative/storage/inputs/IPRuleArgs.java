// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.Action;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP rule with specific IP or IP range in CIDR format.
 * 
 */
public final class IPRuleArgs extends ResourceArgs {

    public static final IPRuleArgs Empty = new IPRuleArgs();

    /**
     * The action of IP ACL rule.
     * 
     */
    @Import(name="action")
    private @Nullable Output<Action> action;

    /**
     * @return The action of IP ACL rule.
     * 
     */
    public Optional<Output<Action>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    @Import(name="iPAddressOrRange", required=true)
    private Output<String> iPAddressOrRange;

    /**
     * @return Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    public Output<String> iPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    private IPRuleArgs() {}

    private IPRuleArgs(IPRuleArgs $) {
        this.action = $.action;
        this.iPAddressOrRange = $.iPAddressOrRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPRuleArgs $;

        public Builder() {
            $ = new IPRuleArgs();
        }

        public Builder(IPRuleArgs defaults) {
            $ = new IPRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action of IP ACL rule.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<Action> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action of IP ACL rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Action action) {
            return action(Output.of(action));
        }

        /**
         * @param iPAddressOrRange Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
         * 
         * @return builder
         * 
         */
        public Builder iPAddressOrRange(Output<String> iPAddressOrRange) {
            $.iPAddressOrRange = iPAddressOrRange;
            return this;
        }

        /**
         * @param iPAddressOrRange Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
         * 
         * @return builder
         * 
         */
        public Builder iPAddressOrRange(String iPAddressOrRange) {
            return iPAddressOrRange(Output.of(iPAddressOrRange));
        }

        public IPRuleArgs build() {
            $.action = Codegen.objectProp("action", Action.class).output().arg($.action).def(Action.Allow).getNullable();
            $.iPAddressOrRange = Objects.requireNonNull($.iPAddressOrRange, "expected parameter 'iPAddressOrRange' to be non-null");
            return $;
        }
    }

}
