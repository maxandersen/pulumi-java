// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an environment variable to be made available in a container. This message is a subset of the [Kubernetes EnvVar v1 core specification](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.18/#envvar-v1-core).
 * 
 */
public final class GoogleCloudMlV1__EnvVarResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__EnvVarResponse Empty = new GoogleCloudMlV1__EnvVarResponse();

    /**
     * Name of the environment variable. Must be a [valid C identifier](https://github.com/kubernetes/kubernetes/blob/v1.18.8/staging/src/k8s.io/apimachinery/pkg/util/validation/validation.go#L258) and must not begin with the prefix `AIP_`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Value of the environment variable. Defaults to an empty string. In this field, you can reference [environment variables set by AI Platform Prediction](/ai-platform/prediction/docs/custom-container-requirements#aip-variables) and environment variables set earlier in the same env field as where this message occurs. You cannot reference environment variables set in the Docker image. In order for environment variables to be expanded, reference them by using the following syntax: $(VARIABLE_NAME) Note that this differs from Bash variable expansion, which does not use parentheses. If a variable cannot be resolved, the reference in the input string is used unchanged. To avoid variable expansion, you can escape this syntax with `$$`; for example: $$(VARIABLE_NAME)
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GoogleCloudMlV1__EnvVarResponse() {}

    private GoogleCloudMlV1__EnvVarResponse(GoogleCloudMlV1__EnvVarResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__EnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__EnvVarResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__EnvVarResponse();
        }

        public Builder(GoogleCloudMlV1__EnvVarResponse defaults) {
            $ = new GoogleCloudMlV1__EnvVarResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GoogleCloudMlV1__EnvVarResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
