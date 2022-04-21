// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ArtifactHashesResponse;
import java.lang.String;
import java.util.Objects;


public final class GrafeasV1beta1IntotoArtifactResponse extends com.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1IntotoArtifactResponse Empty = new GrafeasV1beta1IntotoArtifactResponse();

    @Import(name="hashes", required=true)
    private ArtifactHashesResponse hashes;

    public ArtifactHashesResponse hashes() {
        return this.hashes;
    }

    @Import(name="resourceUri", required=true)
    private String resourceUri;

    public String resourceUri() {
        return this.resourceUri;
    }

    private GrafeasV1beta1IntotoArtifactResponse() {}

    private GrafeasV1beta1IntotoArtifactResponse(GrafeasV1beta1IntotoArtifactResponse $) {
        this.hashes = $.hashes;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrafeasV1beta1IntotoArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrafeasV1beta1IntotoArtifactResponse $;

        public Builder() {
            $ = new GrafeasV1beta1IntotoArtifactResponse();
        }

        public Builder(GrafeasV1beta1IntotoArtifactResponse defaults) {
            $ = new GrafeasV1beta1IntotoArtifactResponse(Objects.requireNonNull(defaults));
        }

        public Builder hashes(ArtifactHashesResponse hashes) {
            $.hashes = hashes;
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GrafeasV1beta1IntotoArtifactResponse build() {
            $.hashes = Objects.requireNonNull($.hashes, "expected parameter 'hashes' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
