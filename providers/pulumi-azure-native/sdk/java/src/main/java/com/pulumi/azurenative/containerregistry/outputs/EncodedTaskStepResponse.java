// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.BaseImageDependencyResponse;
import com.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncodedTaskStepResponse {
    /**
     * @return List of base image dependencies for a step.
     * 
     */
    private final List<BaseImageDependencyResponse> baseImageDependencies;
    /**
     * @return The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    private final @Nullable String contextAccessToken;
    /**
     * @return The URL(absolute or relative) of the source context for the task step.
     * 
     */
    private final @Nullable String contextPath;
    /**
     * @return Base64 encoded value of the template/definition file content.
     * 
     */
    private final String encodedTaskContent;
    /**
     * @return Base64 encoded value of the parameters/values file content.
     * 
     */
    private final @Nullable String encodedValuesContent;
    /**
     * @return The type of the step.
     * Expected value is &#39;EncodedTask&#39;.
     * 
     */
    private final String type;
    /**
     * @return The collection of overridable values that can be passed when running a task.
     * 
     */
    private final @Nullable List<SetValueResponse> values;

    @CustomType.Constructor
    private EncodedTaskStepResponse(
        @CustomType.Parameter("baseImageDependencies") List<BaseImageDependencyResponse> baseImageDependencies,
        @CustomType.Parameter("contextAccessToken") @Nullable String contextAccessToken,
        @CustomType.Parameter("contextPath") @Nullable String contextPath,
        @CustomType.Parameter("encodedTaskContent") String encodedTaskContent,
        @CustomType.Parameter("encodedValuesContent") @Nullable String encodedValuesContent,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("values") @Nullable List<SetValueResponse> values) {
        this.baseImageDependencies = baseImageDependencies;
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.encodedTaskContent = encodedTaskContent;
        this.encodedValuesContent = encodedValuesContent;
        this.type = type;
        this.values = values;
    }

    /**
     * @return List of base image dependencies for a step.
     * 
     */
    public List<BaseImageDependencyResponse> baseImageDependencies() {
        return this.baseImageDependencies;
    }
    /**
     * @return The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    public Optional<String> contextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }
    /**
     * @return The URL(absolute or relative) of the source context for the task step.
     * 
     */
    public Optional<String> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    /**
     * @return Base64 encoded value of the template/definition file content.
     * 
     */
    public String encodedTaskContent() {
        return this.encodedTaskContent;
    }
    /**
     * @return Base64 encoded value of the parameters/values file content.
     * 
     */
    public Optional<String> encodedValuesContent() {
        return Optional.ofNullable(this.encodedValuesContent);
    }
    /**
     * @return The type of the step.
     * Expected value is &#39;EncodedTask&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The collection of overridable values that can be passed when running a task.
     * 
     */
    public List<SetValueResponse> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder baseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }
        public Builder baseImageDependencies(BaseImageDependencyResponse... baseImageDependencies) {
            return baseImageDependencies(List.of(baseImageDependencies));
        }
        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }
        public Builder contextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public Builder encodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }
        public Builder encodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }
        public Builder values(SetValueResponse... values) {
            return values(List.of(values));
        }        public EncodedTaskStepResponse build() {
            return new EncodedTaskStepResponse(baseImageDependencies, contextAccessToken, contextPath, encodedTaskContent, encodedValuesContent, type, values);
        }
    }
}
