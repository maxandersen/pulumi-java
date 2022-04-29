// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Map a field of profile to its corresponding StrongId in Related Profile.
 * 
 */
public final class RelationshipTypeFieldMappingArgs extends ResourceArgs {

    public static final RelationshipTypeFieldMappingArgs Empty = new RelationshipTypeFieldMappingArgs();

    /**
     * Specifies the fieldName in profile.
     * 
     */
    @Import(name="profileFieldName", required=true)
    private Output<String> profileFieldName;

    /**
     * @return Specifies the fieldName in profile.
     * 
     */
    public Output<String> profileFieldName() {
        return this.profileFieldName;
    }

    /**
     * Specifies the KeyProperty (from StrongId) of the related profile.
     * 
     */
    @Import(name="relatedProfileKeyProperty", required=true)
    private Output<String> relatedProfileKeyProperty;

    /**
     * @return Specifies the KeyProperty (from StrongId) of the related profile.
     * 
     */
    public Output<String> relatedProfileKeyProperty() {
        return this.relatedProfileKeyProperty;
    }

    private RelationshipTypeFieldMappingArgs() {}

    private RelationshipTypeFieldMappingArgs(RelationshipTypeFieldMappingArgs $) {
        this.profileFieldName = $.profileFieldName;
        this.relatedProfileKeyProperty = $.relatedProfileKeyProperty;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelationshipTypeFieldMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelationshipTypeFieldMappingArgs $;

        public Builder() {
            $ = new RelationshipTypeFieldMappingArgs();
        }

        public Builder(RelationshipTypeFieldMappingArgs defaults) {
            $ = new RelationshipTypeFieldMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileFieldName Specifies the fieldName in profile.
         * 
         * @return builder
         * 
         */
        public Builder profileFieldName(Output<String> profileFieldName) {
            $.profileFieldName = profileFieldName;
            return this;
        }

        /**
         * @param profileFieldName Specifies the fieldName in profile.
         * 
         * @return builder
         * 
         */
        public Builder profileFieldName(String profileFieldName) {
            return profileFieldName(Output.of(profileFieldName));
        }

        /**
         * @param relatedProfileKeyProperty Specifies the KeyProperty (from StrongId) of the related profile.
         * 
         * @return builder
         * 
         */
        public Builder relatedProfileKeyProperty(Output<String> relatedProfileKeyProperty) {
            $.relatedProfileKeyProperty = relatedProfileKeyProperty;
            return this;
        }

        /**
         * @param relatedProfileKeyProperty Specifies the KeyProperty (from StrongId) of the related profile.
         * 
         * @return builder
         * 
         */
        public Builder relatedProfileKeyProperty(String relatedProfileKeyProperty) {
            return relatedProfileKeyProperty(Output.of(relatedProfileKeyProperty));
        }

        public RelationshipTypeFieldMappingArgs build() {
            $.profileFieldName = Objects.requireNonNull($.profileFieldName, "expected parameter 'profileFieldName' to be non-null");
            $.relatedProfileKeyProperty = Objects.requireNonNull($.relatedProfileKeyProperty, "expected parameter 'relatedProfileKeyProperty' to be non-null");
            return $;
        }
    }

}
