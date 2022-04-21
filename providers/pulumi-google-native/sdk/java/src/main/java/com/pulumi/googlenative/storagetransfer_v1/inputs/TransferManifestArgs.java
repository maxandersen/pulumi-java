// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies where the manifest is located.
 * 
 */
public final class TransferManifestArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferManifestArgs Empty = new TransferManifestArgs();

    /**
     * Specifies the path to the manifest in Cloud Storage. The Google-managed service account for the transfer must have `storage.objects.get` permission for this object. An example path is `gs://bucket_name/path/manifest.csv`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    private TransferManifestArgs() {}

    private TransferManifestArgs(TransferManifestArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferManifestArgs $;

        public Builder() {
            $ = new TransferManifestArgs();
        }

        public Builder(TransferManifestArgs defaults) {
            $ = new TransferManifestArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public TransferManifestArgs build() {
            return $;
        }
    }

}
