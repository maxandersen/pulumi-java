// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Artifact describes a build product.
 * 
 */
public final class ArtifactResponse extends com.pulumi.resources.InvokeArgs {

    public static final ArtifactResponse Empty = new ArtifactResponse();

    /**
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
     * 
     */
    @Import(name="checksum", required=true)
    private String checksum;

    public String checksum() {
        return this.checksum;
    }

    /**
     * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
     * 
     */
    @Import(name="names", required=true)
    private List<String> names;

    public List<String> names() {
        return this.names;
    }

    private ArtifactResponse() {}

    private ArtifactResponse(ArtifactResponse $) {
        this.checksum = $.checksum;
        this.names = $.names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactResponse $;

        public Builder() {
            $ = new ArtifactResponse();
        }

        public Builder(ArtifactResponse defaults) {
            $ = new ArtifactResponse(Objects.requireNonNull(defaults));
        }

        public Builder checksum(String checksum) {
            $.checksum = checksum;
            return this;
        }

        public Builder names(List<String> names) {
            $.names = names;
            return this;
        }

        public Builder names(String... names) {
            return names(List.of(names));
        }

        public ArtifactResponse build() {
            $.checksum = Objects.requireNonNull($.checksum, "expected parameter 'checksum' to be non-null");
            $.names = Objects.requireNonNull($.names, "expected parameter 'names' to be non-null");
            return $;
        }
    }

}
