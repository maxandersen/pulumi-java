// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the REST health check step properties.
 * 
 */
public final class RestHealthCheckStepAttributesResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestHealthCheckStepAttributesResponse Empty = new RestHealthCheckStepAttributesResponse();

    /**
     * The list of checks that form the health check step.
     * 
     */
    @Import(name="healthChecks", required=true)
    private List<RestHealthCheckResponse> healthChecks;

    public List<RestHealthCheckResponse> healthChecks() {
        return this.healthChecks;
    }

    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
     */
    @Import(name="healthyStateDuration", required=true)
    private String healthyStateDuration;

    public String healthyStateDuration() {
        return this.healthyStateDuration;
    }

    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn&#39;t. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
     */
    @Import(name="maxElasticDuration")
    private @Nullable String maxElasticDuration;

    public Optional<String> maxElasticDuration() {
        return Optional.ofNullable(this.maxElasticDuration);
    }

    /**
     * The type of health check.
     * Expected value is &#39;REST&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
     */
    @Import(name="waitDuration")
    private @Nullable String waitDuration;

    public Optional<String> waitDuration() {
        return Optional.ofNullable(this.waitDuration);
    }

    private RestHealthCheckStepAttributesResponse() {}

    private RestHealthCheckStepAttributesResponse(RestHealthCheckStepAttributesResponse $) {
        this.healthChecks = $.healthChecks;
        this.healthyStateDuration = $.healthyStateDuration;
        this.maxElasticDuration = $.maxElasticDuration;
        this.type = $.type;
        this.waitDuration = $.waitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestHealthCheckStepAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestHealthCheckStepAttributesResponse $;

        public Builder() {
            $ = new RestHealthCheckStepAttributesResponse();
        }

        public Builder(RestHealthCheckStepAttributesResponse defaults) {
            $ = new RestHealthCheckStepAttributesResponse(Objects.requireNonNull(defaults));
        }

        public Builder healthChecks(List<RestHealthCheckResponse> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        public Builder healthChecks(RestHealthCheckResponse... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        public Builder healthyStateDuration(String healthyStateDuration) {
            $.healthyStateDuration = healthyStateDuration;
            return this;
        }

        public Builder maxElasticDuration(@Nullable String maxElasticDuration) {
            $.maxElasticDuration = maxElasticDuration;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder waitDuration(@Nullable String waitDuration) {
            $.waitDuration = waitDuration;
            return this;
        }

        public RestHealthCheckStepAttributesResponse build() {
            $.healthChecks = Objects.requireNonNull($.healthChecks, "expected parameter 'healthChecks' to be non-null");
            $.healthyStateDuration = Objects.requireNonNull($.healthyStateDuration, "expected parameter 'healthyStateDuration' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
