// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwaggerSpecificationResponse {
    private final @Nullable List<String> apiVersions;
    private final @Nullable String swaggerSpecFolderUri;

    @CustomType.Constructor
    private SwaggerSpecificationResponse(
        @CustomType.Parameter("apiVersions") @Nullable List<String> apiVersions,
        @CustomType.Parameter("swaggerSpecFolderUri") @Nullable String swaggerSpecFolderUri) {
        this.apiVersions = apiVersions;
        this.swaggerSpecFolderUri = swaggerSpecFolderUri;
    }

    public List<String> apiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    public Optional<String> swaggerSpecFolderUri() {
        return Optional.ofNullable(this.swaggerSpecFolderUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwaggerSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private @Nullable String swaggerSpecFolderUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SwaggerSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.swaggerSpecFolderUri = defaults.swaggerSpecFolderUri;
        }

        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        public Builder swaggerSpecFolderUri(@Nullable String swaggerSpecFolderUri) {
            this.swaggerSpecFolderUri = swaggerSpecFolderUri;
            return this;
        }        public SwaggerSpecificationResponse build() {
            return new SwaggerSpecificationResponse(apiVersions, swaggerSpecFolderUri);
        }
    }
}
