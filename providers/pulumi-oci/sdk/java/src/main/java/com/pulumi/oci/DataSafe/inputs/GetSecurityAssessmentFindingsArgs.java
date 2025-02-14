// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetSecurityAssessmentFindingsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityAssessmentFindingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityAssessmentFindingsArgs Empty = new GetSecurityAssessmentFindingsArgs();

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable String accessLevel;

    /**
     * @return Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    @Import(name="filters")
    private @Nullable List<GetSecurityAssessmentFindingsFilter> filters;

    public Optional<List<GetSecurityAssessmentFindingsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Each finding has a key. This key is same for the finding across targets
     * 
     */
    @Import(name="findingKey")
    private @Nullable String findingKey;

    /**
     * @return Each finding has a key. This key is same for the finding across targets
     * 
     */
    public Optional<String> findingKey() {
        return Optional.ofNullable(this.findingKey);
    }

    /**
     * The OCID of the security assessment.
     * 
     */
    @Import(name="securityAssessmentId", required=true)
    private String securityAssessmentId;

    /**
     * @return The OCID of the security assessment.
     * 
     */
    public String securityAssessmentId() {
        return this.securityAssessmentId;
    }

    /**
     * A filter to return only findings of a particular risk level.
     * 
     */
    @Import(name="severity")
    private @Nullable String severity;

    /**
     * @return A filter to return only findings of a particular risk level.
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }

    private GetSecurityAssessmentFindingsArgs() {}

    private GetSecurityAssessmentFindingsArgs(GetSecurityAssessmentFindingsArgs $) {
        this.accessLevel = $.accessLevel;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.filters = $.filters;
        this.findingKey = $.findingKey;
        this.securityAssessmentId = $.securityAssessmentId;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityAssessmentFindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityAssessmentFindingsArgs $;

        public Builder() {
            $ = new GetSecurityAssessmentFindingsArgs();
        }

        public Builder(GetSecurityAssessmentFindingsArgs defaults) {
            $ = new GetSecurityAssessmentFindingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable String accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        public Builder filters(@Nullable List<GetSecurityAssessmentFindingsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSecurityAssessmentFindingsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param findingKey Each finding has a key. This key is same for the finding across targets
         * 
         * @return builder
         * 
         */
        public Builder findingKey(@Nullable String findingKey) {
            $.findingKey = findingKey;
            return this;
        }

        /**
         * @param securityAssessmentId The OCID of the security assessment.
         * 
         * @return builder
         * 
         */
        public Builder securityAssessmentId(String securityAssessmentId) {
            $.securityAssessmentId = securityAssessmentId;
            return this;
        }

        /**
         * @param severity A filter to return only findings of a particular risk level.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable String severity) {
            $.severity = severity;
            return this;
        }

        public GetSecurityAssessmentFindingsArgs build() {
            $.securityAssessmentId = Objects.requireNonNull($.securityAssessmentId, "expected parameter 'securityAssessmentId' to be non-null");
            return $;
        }
    }

}
