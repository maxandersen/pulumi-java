// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebACLAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebACLAssociationArgs Empty = new GetWebACLAssociationArgs();

    @Import(name="resourceArn", required=true)
    private String resourceArn;

    public String resourceArn() {
        return this.resourceArn;
    }

    @Import(name="webACLArn", required=true)
    private String webACLArn;

    public String webACLArn() {
        return this.webACLArn;
    }

    private GetWebACLAssociationArgs() {}

    private GetWebACLAssociationArgs(GetWebACLAssociationArgs $) {
        this.resourceArn = $.resourceArn;
        this.webACLArn = $.webACLArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebACLAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebACLAssociationArgs $;

        public Builder() {
            $ = new GetWebACLAssociationArgs();
        }

        public Builder(GetWebACLAssociationArgs defaults) {
            $ = new GetWebACLAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceArn(String resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder webACLArn(String webACLArn) {
            $.webACLArn = webACLArn;
            return this;
        }

        public GetWebACLAssociationArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            $.webACLArn = Objects.requireNonNull($.webACLArn, "expected parameter 'webACLArn' to be non-null");
            return $;
        }
    }

}
