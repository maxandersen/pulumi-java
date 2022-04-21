// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an incident label
 * 
 */
public final class IncidentLabelResponse extends com.pulumi.resources.InvokeArgs {

    public static final IncidentLabelResponse Empty = new IncidentLabelResponse();

    /**
     * The name of the label
     * 
     */
    @Import(name="labelName", required=true)
    private String labelName;

    public String labelName() {
        return this.labelName;
    }

    /**
     * The type of the label
     * 
     */
    @Import(name="labelType", required=true)
    private String labelType;

    public String labelType() {
        return this.labelType;
    }

    private IncidentLabelResponse() {}

    private IncidentLabelResponse(IncidentLabelResponse $) {
        this.labelName = $.labelName;
        this.labelType = $.labelType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentLabelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentLabelResponse $;

        public Builder() {
            $ = new IncidentLabelResponse();
        }

        public Builder(IncidentLabelResponse defaults) {
            $ = new IncidentLabelResponse(Objects.requireNonNull(defaults));
        }

        public Builder labelName(String labelName) {
            $.labelName = labelName;
            return this;
        }

        public Builder labelType(String labelType) {
            $.labelType = labelType;
            return this;
        }

        public IncidentLabelResponse build() {
            $.labelName = Objects.requireNonNull($.labelName, "expected parameter 'labelName' to be non-null");
            $.labelType = Objects.requireNonNull($.labelType, "expected parameter 'labelType' to be non-null");
            return $;
        }
    }

}
