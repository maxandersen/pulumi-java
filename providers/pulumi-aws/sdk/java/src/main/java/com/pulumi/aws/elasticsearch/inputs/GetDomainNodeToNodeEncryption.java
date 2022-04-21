// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetDomainNodeToNodeEncryption extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainNodeToNodeEncryption Empty = new GetDomainNodeToNodeEncryption();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    private GetDomainNodeToNodeEncryption() {}

    private GetDomainNodeToNodeEncryption(GetDomainNodeToNodeEncryption $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainNodeToNodeEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainNodeToNodeEncryption $;

        public Builder() {
            $ = new GetDomainNodeToNodeEncryption();
        }

        public Builder(GetDomainNodeToNodeEncryption defaults) {
            $ = new GetDomainNodeToNodeEncryption(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public GetDomainNodeToNodeEncryption build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
