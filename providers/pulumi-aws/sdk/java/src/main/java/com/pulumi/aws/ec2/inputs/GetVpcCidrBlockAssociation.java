// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcCidrBlockAssociation extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcCidrBlockAssociation Empty = new GetVpcCidrBlockAssociation();

    /**
     * The association ID for the the IPv4 CIDR block.
     * 
     */
    @Import(name="associationId", required=true)
    private String associationId;

    public String associationId() {
        return this.associationId;
    }

    /**
     * The cidr block of the desired VPC.
     * 
     */
    @Import(name="cidrBlock", required=true)
    private String cidrBlock;

    public String cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The current state of the desired VPC.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private GetVpcCidrBlockAssociation() {}

    private GetVpcCidrBlockAssociation(GetVpcCidrBlockAssociation $) {
        this.associationId = $.associationId;
        this.cidrBlock = $.cidrBlock;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcCidrBlockAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcCidrBlockAssociation $;

        public Builder() {
            $ = new GetVpcCidrBlockAssociation();
        }

        public Builder(GetVpcCidrBlockAssociation defaults) {
            $ = new GetVpcCidrBlockAssociation(Objects.requireNonNull(defaults));
        }

        public Builder associationId(String associationId) {
            $.associationId = associationId;
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public GetVpcCidrBlockAssociation build() {
            $.associationId = Objects.requireNonNull($.associationId, "expected parameter 'associationId' to be non-null");
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
