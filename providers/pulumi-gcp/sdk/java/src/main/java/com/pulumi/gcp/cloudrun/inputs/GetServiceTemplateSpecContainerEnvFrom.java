// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvFromConfigMapRef;
import com.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvFromSecretRef;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnvFrom extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnvFrom Empty = new GetServiceTemplateSpecContainerEnvFrom();

    @Import(name="configMapReves", required=true)
      private final List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves;

    public List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves() {
        return this.configMapReves;
    }

    @Import(name="prefix", required=true)
      private final String prefix;

    public String prefix() {
        return this.prefix;
    }

    @Import(name="secretReves", required=true)
      private final List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves;

    public List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves() {
        return this.secretReves;
    }

    public GetServiceTemplateSpecContainerEnvFrom(
        List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves,
        String prefix,
        List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves) {
        this.configMapReves = Objects.requireNonNull(configMapReves, "expected parameter 'configMapReves' to be non-null");
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.secretReves = Objects.requireNonNull(secretReves, "expected parameter 'secretReves' to be non-null");
    }

    private GetServiceTemplateSpecContainerEnvFrom() {
        this.configMapReves = List.of();
        this.prefix = null;
        this.secretReves = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFrom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves;
        private String prefix;
        private List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapReves = defaults.configMapReves;
    	      this.prefix = defaults.prefix;
    	      this.secretReves = defaults.secretReves;
        }

        public Builder configMapReves(List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves) {
            this.configMapReves = Objects.requireNonNull(configMapReves);
            return this;
        }
        public Builder configMapReves(GetServiceTemplateSpecContainerEnvFromConfigMapRef... configMapReves) {
            return configMapReves(List.of(configMapReves));
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder secretReves(List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves) {
            this.secretReves = Objects.requireNonNull(secretReves);
            return this;
        }
        public Builder secretReves(GetServiceTemplateSpecContainerEnvFromSecretRef... secretReves) {
            return secretReves(List.of(secretReves));
        }        public GetServiceTemplateSpecContainerEnvFrom build() {
            return new GetServiceTemplateSpecContainerEnvFrom(configMapReves, prefix, secretReves);
        }
    }
}
