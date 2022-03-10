// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VmImageResponse {
    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    private final String imageFamily;
    /**
     * Use VM image name to find the image.
     * 
     */
    private final String imageName;
    /**
     * The name of the Google Cloud project that this VM image belongs to. Format: `projects/{project_id}`
     * 
     */
    private final String project;

    @OutputCustomType.Constructor
    private VmImageResponse(
        @OutputCustomType.Parameter("imageFamily") String imageFamily,
        @OutputCustomType.Parameter("imageName") String imageName,
        @OutputCustomType.Parameter("project") String project) {
        this.imageFamily = imageFamily;
        this.imageName = imageName;
        this.project = project;
    }

    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
    */
    public String getImageFamily() {
        return this.imageFamily;
    }
    /**
     * Use VM image name to find the image.
     * 
    */
    public String getImageName() {
        return this.imageName;
    }
    /**
     * The name of the Google Cloud project that this VM image belongs to. Format: `projects/{project_id}`
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageFamily;
        private String imageName;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(VmImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageFamily = defaults.imageFamily;
    	      this.imageName = defaults.imageName;
    	      this.project = defaults.project;
        }

        public Builder setImageFamily(String imageFamily) {
            this.imageFamily = Objects.requireNonNull(imageFamily);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public VmImageResponse build() {
            return new VmImageResponse(imageFamily, imageName, project);
        }
    }
}
