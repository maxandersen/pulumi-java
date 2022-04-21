// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.DiagnosticResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PollingOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final PollingOptionsResponse Empty = new PollingOptionsResponse();

    /**
     * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
     * 
     */
    @Import(name="diagnostics", required=true)
    private List<DiagnosticResponse> diagnostics;

    public List<DiagnosticResponse> diagnostics() {
        return this.diagnostics;
    }

    /**
     * JsonPath expression that determines if the request failed.
     * 
     */
    @Import(name="failCondition", required=true)
    private String failCondition;

    public String failCondition() {
        return this.failCondition;
    }

    /**
     * JsonPath expression that determines if the request is completed.
     * 
     */
    @Import(name="finishCondition", required=true)
    private String finishCondition;

    public String finishCondition() {
        return this.finishCondition;
    }

    /**
     * JsonPath expression that evaluates to string, it indicates where to poll.
     * 
     */
    @Import(name="pollingLink", required=true)
    private String pollingLink;

    public String pollingLink() {
        return this.pollingLink;
    }

    /**
     * JsonPath expression, after polling is completed, indicates where to fetch the resource.
     * 
     */
    @Import(name="targetLink", required=true)
    private String targetLink;

    public String targetLink() {
        return this.targetLink;
    }

    private PollingOptionsResponse() {}

    private PollingOptionsResponse(PollingOptionsResponse $) {
        this.diagnostics = $.diagnostics;
        this.failCondition = $.failCondition;
        this.finishCondition = $.finishCondition;
        this.pollingLink = $.pollingLink;
        this.targetLink = $.targetLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PollingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PollingOptionsResponse $;

        public Builder() {
            $ = new PollingOptionsResponse();
        }

        public Builder(PollingOptionsResponse defaults) {
            $ = new PollingOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder diagnostics(List<DiagnosticResponse> diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        public Builder diagnostics(DiagnosticResponse... diagnostics) {
            return diagnostics(List.of(diagnostics));
        }

        public Builder failCondition(String failCondition) {
            $.failCondition = failCondition;
            return this;
        }

        public Builder finishCondition(String finishCondition) {
            $.finishCondition = finishCondition;
            return this;
        }

        public Builder pollingLink(String pollingLink) {
            $.pollingLink = pollingLink;
            return this;
        }

        public Builder targetLink(String targetLink) {
            $.targetLink = targetLink;
            return this;
        }

        public PollingOptionsResponse build() {
            $.diagnostics = Objects.requireNonNull($.diagnostics, "expected parameter 'diagnostics' to be non-null");
            $.failCondition = Objects.requireNonNull($.failCondition, "expected parameter 'failCondition' to be non-null");
            $.finishCondition = Objects.requireNonNull($.finishCondition, "expected parameter 'finishCondition' to be non-null");
            $.pollingLink = Objects.requireNonNull($.pollingLink, "expected parameter 'pollingLink' to be non-null");
            $.targetLink = Objects.requireNonNull($.targetLink, "expected parameter 'targetLink' to be non-null");
            return $;
        }
    }

}
