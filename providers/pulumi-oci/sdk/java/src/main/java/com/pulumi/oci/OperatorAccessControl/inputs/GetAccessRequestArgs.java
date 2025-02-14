// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessRequestArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessRequestArgs Empty = new GetAccessRequestArgs();

    /**
     * unique AccessRequest identifier
     * 
     */
    @Import(name="accessRequestId", required=true)
    private String accessRequestId;

    /**
     * @return unique AccessRequest identifier
     * 
     */
    public String accessRequestId() {
        return this.accessRequestId;
    }

    private GetAccessRequestArgs() {}

    private GetAccessRequestArgs(GetAccessRequestArgs $) {
        this.accessRequestId = $.accessRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessRequestArgs $;

        public Builder() {
            $ = new GetAccessRequestArgs();
        }

        public Builder(GetAccessRequestArgs defaults) {
            $ = new GetAccessRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRequestId unique AccessRequest identifier
         * 
         * @return builder
         * 
         */
        public Builder accessRequestId(String accessRequestId) {
            $.accessRequestId = accessRequestId;
            return this;
        }

        public GetAccessRequestArgs build() {
            $.accessRequestId = Objects.requireNonNull($.accessRequestId, "expected parameter 'accessRequestId' to be non-null");
            return $;
        }
    }

}
