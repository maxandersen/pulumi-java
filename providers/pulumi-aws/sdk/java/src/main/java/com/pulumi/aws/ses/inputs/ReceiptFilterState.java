// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptFilterState extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptFilterState Empty = new ReceiptFilterState();

    /**
     * The SES receipt filter ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The IP address or address range to filter, in CIDR notation
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The name of the filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Block or Allow
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private ReceiptFilterState() {}

    private ReceiptFilterState(ReceiptFilterState $) {
        this.arn = $.arn;
        this.cidr = $.cidr;
        this.name = $.name;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptFilterState $;

        public Builder() {
            $ = new ReceiptFilterState();
        }

        public Builder(ReceiptFilterState defaults) {
            $ = new ReceiptFilterState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ReceiptFilterState build() {
            return $;
        }
    }

}
