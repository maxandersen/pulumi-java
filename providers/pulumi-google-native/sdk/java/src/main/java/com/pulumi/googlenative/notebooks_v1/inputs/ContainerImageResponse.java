// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of a container image for starting a notebook instance with the environment installed in a container.
 * 
 */
public final class ContainerImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerImageResponse Empty = new ContainerImageResponse();

    /**
     * The path to the container image repository. For example: `gcr.io/{project_id}/{image_name}`
     * 
     */
    @Import(name="repository", required=true)
      private final String repository;

    public String repository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @Import(name="tag", required=true)
      private final String tag;

    public String tag() {
        return this.tag;
    }

    public ContainerImageResponse(
        String repository,
        String tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private ContainerImageResponse() {
        this.repository = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repository;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }        public ContainerImageResponse build() {
            return new ContainerImageResponse(repository, tag);
        }
    }
}
