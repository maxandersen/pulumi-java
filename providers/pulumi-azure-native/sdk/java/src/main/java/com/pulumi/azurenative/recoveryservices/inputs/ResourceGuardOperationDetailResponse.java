// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGuardOperationDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceGuardOperationDetailResponse Empty = new ResourceGuardOperationDetailResponse();

    @Import(name="defaultResourceRequest")
    private @Nullable String defaultResourceRequest;

    public Optional<String> defaultResourceRequest() {
        return Optional.ofNullable(this.defaultResourceRequest);
    }

    @Import(name="vaultCriticalOperation")
    private @Nullable String vaultCriticalOperation;

    public Optional<String> vaultCriticalOperation() {
        return Optional.ofNullable(this.vaultCriticalOperation);
    }

    private ResourceGuardOperationDetailResponse() {}

    private ResourceGuardOperationDetailResponse(ResourceGuardOperationDetailResponse $) {
        this.defaultResourceRequest = $.defaultResourceRequest;
        this.vaultCriticalOperation = $.vaultCriticalOperation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGuardOperationDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGuardOperationDetailResponse $;

        public Builder() {
            $ = new ResourceGuardOperationDetailResponse();
        }

        public Builder(ResourceGuardOperationDetailResponse defaults) {
            $ = new ResourceGuardOperationDetailResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultResourceRequest(@Nullable String defaultResourceRequest) {
            $.defaultResourceRequest = defaultResourceRequest;
            return this;
        }

        public Builder vaultCriticalOperation(@Nullable String vaultCriticalOperation) {
            $.vaultCriticalOperation = vaultCriticalOperation;
            return this;
        }

        public ResourceGuardOperationDetailResponse build() {
            return $;
        }
    }

}
