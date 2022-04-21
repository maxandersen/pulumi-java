// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2CloudSqlInstanceResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class GoogleCloudRunOpV2VolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2VolumeResponse Empty = new GoogleCloudRunOpV2VolumeResponse();

    /**
     * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * 
     */
    @Import(name="cloudSqlInstance", required=true)
    private GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance;

    public GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance() {
        return this.cloudSqlInstance;
    }

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @Import(name="secret", required=true)
    private GoogleCloudRunOpV2SecretVolumeSourceResponse secret;

    public GoogleCloudRunOpV2SecretVolumeSourceResponse secret() {
        return this.secret;
    }

    private GoogleCloudRunOpV2VolumeResponse() {}

    private GoogleCloudRunOpV2VolumeResponse(GoogleCloudRunOpV2VolumeResponse $) {
        this.cloudSqlInstance = $.cloudSqlInstance;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunOpV2VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2VolumeResponse $;

        public Builder() {
            $ = new GoogleCloudRunOpV2VolumeResponse();
        }

        public Builder(GoogleCloudRunOpV2VolumeResponse defaults) {
            $ = new GoogleCloudRunOpV2VolumeResponse(Objects.requireNonNull(defaults));
        }

        public Builder cloudSqlInstance(GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance) {
            $.cloudSqlInstance = cloudSqlInstance;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder secret(GoogleCloudRunOpV2SecretVolumeSourceResponse secret) {
            $.secret = secret;
            return this;
        }

        public GoogleCloudRunOpV2VolumeResponse build() {
            $.cloudSqlInstance = Objects.requireNonNull($.cloudSqlInstance, "expected parameter 'cloudSqlInstance' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
