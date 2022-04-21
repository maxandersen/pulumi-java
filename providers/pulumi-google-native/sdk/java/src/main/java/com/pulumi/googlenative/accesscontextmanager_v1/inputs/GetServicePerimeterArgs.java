// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServicePerimeterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePerimeterArgs Empty = new GetServicePerimeterArgs();

    @Import(name="accessPolicyId", required=true)
    private String accessPolicyId;

    public String accessPolicyId() {
        return this.accessPolicyId;
    }

    @Import(name="servicePerimeterId", required=true)
    private String servicePerimeterId;

    public String servicePerimeterId() {
        return this.servicePerimeterId;
    }

    private GetServicePerimeterArgs() {}

    private GetServicePerimeterArgs(GetServicePerimeterArgs $) {
        this.accessPolicyId = $.accessPolicyId;
        this.servicePerimeterId = $.servicePerimeterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePerimeterArgs $;

        public Builder() {
            $ = new GetServicePerimeterArgs();
        }

        public Builder(GetServicePerimeterArgs defaults) {
            $ = new GetServicePerimeterArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicyId(String accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder servicePerimeterId(String servicePerimeterId) {
            $.servicePerimeterId = servicePerimeterId;
            return this;
        }

        public GetServicePerimeterArgs build() {
            $.accessPolicyId = Objects.requireNonNull($.accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
            $.servicePerimeterId = Objects.requireNonNull($.servicePerimeterId, "expected parameter 'servicePerimeterId' to be non-null");
            return $;
        }
    }

}
