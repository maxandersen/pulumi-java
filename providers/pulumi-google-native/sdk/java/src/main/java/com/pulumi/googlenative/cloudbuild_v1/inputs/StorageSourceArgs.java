// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of the source in an archive file in Google Cloud Storage.
 * 
 */
public final class StorageSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageSourceArgs Empty = new StorageSourceArgs();

    /**
     * Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Google Cloud Storage object containing the source. This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`) containing source to build.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    private StorageSourceArgs() {}

    private StorageSourceArgs(StorageSourceArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageSourceArgs $;

        public Builder() {
            $ = new StorageSourceArgs();
        }

        public Builder(StorageSourceArgs defaults) {
            $ = new StorageSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public StorageSourceArgs build() {
            return $;
        }
    }

}
