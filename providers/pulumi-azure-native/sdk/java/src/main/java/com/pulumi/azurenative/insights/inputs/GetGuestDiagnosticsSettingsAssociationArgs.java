// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetGuestDiagnosticsSettingsAssociationArgs extends InvokeArgs {

    public static final GetGuestDiagnosticsSettingsAssociationArgs Empty = new GetGuestDiagnosticsSettingsAssociationArgs();

    /**
     * The name of the diagnostic settings association.
     * 
     */
    @Import(name="associationName", required=true)
    private String associationName;

    /**
     * @return The name of the diagnostic settings association.
     * 
     */
    public String associationName() {
        return this.associationName;
    }

    /**
     * The fully qualified ID of the resource, including the resource name and resource type.
     * 
     */
    @Import(name="resourceUri", required=true)
    private String resourceUri;

    /**
     * @return The fully qualified ID of the resource, including the resource name and resource type.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    private GetGuestDiagnosticsSettingsAssociationArgs() {}

    private GetGuestDiagnosticsSettingsAssociationArgs(GetGuestDiagnosticsSettingsAssociationArgs $) {
        this.associationName = $.associationName;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGuestDiagnosticsSettingsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGuestDiagnosticsSettingsAssociationArgs $;

        public Builder() {
            $ = new GetGuestDiagnosticsSettingsAssociationArgs();
        }

        public Builder(GetGuestDiagnosticsSettingsAssociationArgs defaults) {
            $ = new GetGuestDiagnosticsSettingsAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationName The name of the diagnostic settings association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(String associationName) {
            $.associationName = associationName;
            return this;
        }

        /**
         * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GetGuestDiagnosticsSettingsAssociationArgs build() {
            $.associationName = Objects.requireNonNull($.associationName, "expected parameter 'associationName' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
