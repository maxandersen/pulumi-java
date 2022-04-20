// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1AnnotationSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAnnotationSpecSetResult {
    /**
     * The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task.
     * 
     */
    private final List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse> annotationSpecs;
    /**
     * The names of any related resources that are blocking changes to the annotation spec set.
     * 
     */
    private final List<String> blockingResources;
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long.
     * 
     */
    private final String description;
    /**
     * The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * The AnnotationSpecSet resource name in the following format: &#34;projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}&#34;
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetAnnotationSpecSetResult(
        @CustomType.Parameter("annotationSpecs") List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse> annotationSpecs,
        @CustomType.Parameter("blockingResources") List<String> blockingResources,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name) {
        this.annotationSpecs = annotationSpecs;
        this.blockingResources = blockingResources;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task.
     * 
    */
    public List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse> annotationSpecs() {
        return this.annotationSpecs;
    }
    /**
     * The names of any related resources that are blocking changes to the annotation spec set.
     * 
    */
    public List<String> blockingResources() {
        return this.blockingResources;
    }
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The AnnotationSpecSet resource name in the following format: &#34;projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}&#34;
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnnotationSpecSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse> annotationSpecs;
        private List<String> blockingResources;
        private String description;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnnotationSpecSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecs = defaults.annotationSpecs;
    	      this.blockingResources = defaults.blockingResources;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder annotationSpecs(List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse> annotationSpecs) {
            this.annotationSpecs = Objects.requireNonNull(annotationSpecs);
            return this;
        }
        public Builder annotationSpecs(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse... annotationSpecs) {
            return annotationSpecs(List.of(annotationSpecs));
        }
        public Builder blockingResources(List<String> blockingResources) {
            this.blockingResources = Objects.requireNonNull(blockingResources);
            return this;
        }
        public Builder blockingResources(String... blockingResources) {
            return blockingResources(List.of(blockingResources));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetAnnotationSpecSetResult build() {
            return new GetAnnotationSpecSetResult(annotationSpecs, blockingResources, description, displayName, name);
        }
    }
}
