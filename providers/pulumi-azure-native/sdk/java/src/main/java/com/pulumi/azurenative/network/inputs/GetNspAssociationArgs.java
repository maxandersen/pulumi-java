// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNspAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNspAssociationArgs Empty = new GetNspAssociationArgs();

    /**
     * The name of the NSP association.
     * 
     */
    @Import(name="associationName", required=true)
    private String associationName;

    /**
     * @return The name of the NSP association.
     * 
     */
    public String associationName() {
        return this.associationName;
    }

    /**
     * The name of the network security perimeter.
     * 
     */
    @Import(name="networkSecurityPerimeterName", required=true)
    private String networkSecurityPerimeterName;

    /**
     * @return The name of the network security perimeter.
     * 
     */
    public String networkSecurityPerimeterName() {
        return this.networkSecurityPerimeterName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNspAssociationArgs() {}

    private GetNspAssociationArgs(GetNspAssociationArgs $) {
        this.associationName = $.associationName;
        this.networkSecurityPerimeterName = $.networkSecurityPerimeterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNspAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNspAssociationArgs $;

        public Builder() {
            $ = new GetNspAssociationArgs();
        }

        public Builder(GetNspAssociationArgs defaults) {
            $ = new GetNspAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationName The name of the NSP association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(String associationName) {
            $.associationName = associationName;
            return this;
        }

        /**
         * @param networkSecurityPerimeterName The name of the network security perimeter.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityPerimeterName(String networkSecurityPerimeterName) {
            $.networkSecurityPerimeterName = networkSecurityPerimeterName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNspAssociationArgs build() {
            $.associationName = Objects.requireNonNull($.associationName, "expected parameter 'associationName' to be non-null");
            $.networkSecurityPerimeterName = Objects.requireNonNull($.networkSecurityPerimeterName, "expected parameter 'networkSecurityPerimeterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
