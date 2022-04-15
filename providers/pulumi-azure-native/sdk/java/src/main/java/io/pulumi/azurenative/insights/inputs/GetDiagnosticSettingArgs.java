// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticSettingArgs Empty = new GetDiagnosticSettingArgs();

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final String resourceUri;

    public String resourceUri() {
        return this.resourceUri;
    }

    public GetDiagnosticSettingArgs(
        String name,
        String resourceUri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private GetDiagnosticSettingArgs() {
        this.name = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiagnosticSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }        public GetDiagnosticSettingArgs build() {
            return new GetDiagnosticSettingArgs(name, resourceUri);
        }
    }
}
