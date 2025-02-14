// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The participant profile property reference.
 * 
 */
public final class ParticipantProfilePropertyReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParticipantProfilePropertyReferenceArgs Empty = new ParticipantProfilePropertyReferenceArgs();

    /**
     * The source interaction property that maps to the target profile property.
     * 
     */
    @Import(name="interactionPropertyName", required=true)
    private Output<String> interactionPropertyName;

    /**
     * @return The source interaction property that maps to the target profile property.
     * 
     */
    public Output<String> interactionPropertyName() {
        return this.interactionPropertyName;
    }

    /**
     * The target profile property that maps to the source interaction property.
     * 
     */
    @Import(name="profilePropertyName", required=true)
    private Output<String> profilePropertyName;

    /**
     * @return The target profile property that maps to the source interaction property.
     * 
     */
    public Output<String> profilePropertyName() {
        return this.profilePropertyName;
    }

    private ParticipantProfilePropertyReferenceArgs() {}

    private ParticipantProfilePropertyReferenceArgs(ParticipantProfilePropertyReferenceArgs $) {
        this.interactionPropertyName = $.interactionPropertyName;
        this.profilePropertyName = $.profilePropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParticipantProfilePropertyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParticipantProfilePropertyReferenceArgs $;

        public Builder() {
            $ = new ParticipantProfilePropertyReferenceArgs();
        }

        public Builder(ParticipantProfilePropertyReferenceArgs defaults) {
            $ = new ParticipantProfilePropertyReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interactionPropertyName The source interaction property that maps to the target profile property.
         * 
         * @return builder
         * 
         */
        public Builder interactionPropertyName(Output<String> interactionPropertyName) {
            $.interactionPropertyName = interactionPropertyName;
            return this;
        }

        /**
         * @param interactionPropertyName The source interaction property that maps to the target profile property.
         * 
         * @return builder
         * 
         */
        public Builder interactionPropertyName(String interactionPropertyName) {
            return interactionPropertyName(Output.of(interactionPropertyName));
        }

        /**
         * @param profilePropertyName The target profile property that maps to the source interaction property.
         * 
         * @return builder
         * 
         */
        public Builder profilePropertyName(Output<String> profilePropertyName) {
            $.profilePropertyName = profilePropertyName;
            return this;
        }

        /**
         * @param profilePropertyName The target profile property that maps to the source interaction property.
         * 
         * @return builder
         * 
         */
        public Builder profilePropertyName(String profilePropertyName) {
            return profilePropertyName(Output.of(profilePropertyName));
        }

        public ParticipantProfilePropertyReferenceArgs build() {
            $.interactionPropertyName = Objects.requireNonNull($.interactionPropertyName, "expected parameter 'interactionPropertyName' to be non-null");
            $.profilePropertyName = Objects.requireNonNull($.profilePropertyName, "expected parameter 'profilePropertyName' to be non-null");
            return $;
        }
    }

}
