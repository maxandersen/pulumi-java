// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Conditions that determine which objects are transferred. Applies only to Cloud Data Sources such as S3, Azure, and Cloud Storage. The &#34;last modification time&#34; refers to the time of the last change to the object&#39;s content or metadata — specifically, this is the `updated` property of Cloud Storage objects, the `LastModified` field of S3 objects, and the `Last-Modified` header of Azure blobs. Transfers with a PosixFilesystem source or destination don&#39;t support `ObjectConditions`.
 * 
 */
public final class ObjectConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectConditionsArgs Empty = new ObjectConditionsArgs();

    /**
     * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    @Import(name="excludePrefixes")
      private final @Nullable Output<List<String>> excludePrefixes;

    public Output<List<String>> excludePrefixes() {
        return this.excludePrefixes == null ? Codegen.empty() : this.excludePrefixes;
    }

    /**
     * If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    @Import(name="includePrefixes")
      private final @Nullable Output<List<String>> includePrefixes;

    public Output<List<String>> includePrefixes() {
        return this.includePrefixes == null ? Codegen.empty() : this.includePrefixes;
    }

    /**
     * If specified, only objects with a &#34;last modification time&#34; before this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred.
     * 
     */
    @Import(name="lastModifiedBefore")
      private final @Nullable Output<String> lastModifiedBefore;

    public Output<String> lastModifiedBefore() {
        return this.lastModifiedBefore == null ? Codegen.empty() : this.lastModifiedBefore;
    }

    /**
     * If specified, only objects with a &#34;last modification time&#34; on or after this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day&#39;s worth of data at a time. For that you&#39;d set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
     * 
     */
    @Import(name="lastModifiedSince")
      private final @Nullable Output<String> lastModifiedSince;

    public Output<String> lastModifiedSince() {
        return this.lastModifiedSince == null ? Codegen.empty() : this.lastModifiedSince;
    }

    /**
     * Ensures that objects are not transferred if a specific maximum time has elapsed since the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation`and the &#34;last modification time&#34; of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    @Import(name="maxTimeElapsedSinceLastModification")
      private final @Nullable Output<String> maxTimeElapsedSinceLastModification;

    public Output<String> maxTimeElapsedSinceLastModification() {
        return this.maxTimeElapsedSinceLastModification == null ? Codegen.empty() : this.maxTimeElapsedSinceLastModification;
    }

    /**
     * Ensures that objects are not transferred until a specific minimum time has elapsed after the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation` and the &#34;last modification time&#34; of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    @Import(name="minTimeElapsedSinceLastModification")
      private final @Nullable Output<String> minTimeElapsedSinceLastModification;

    public Output<String> minTimeElapsedSinceLastModification() {
        return this.minTimeElapsedSinceLastModification == null ? Codegen.empty() : this.minTimeElapsedSinceLastModification;
    }

    public ObjectConditionsArgs(
        @Nullable Output<List<String>> excludePrefixes,
        @Nullable Output<List<String>> includePrefixes,
        @Nullable Output<String> lastModifiedBefore,
        @Nullable Output<String> lastModifiedSince,
        @Nullable Output<String> maxTimeElapsedSinceLastModification,
        @Nullable Output<String> minTimeElapsedSinceLastModification) {
        this.excludePrefixes = excludePrefixes;
        this.includePrefixes = includePrefixes;
        this.lastModifiedBefore = lastModifiedBefore;
        this.lastModifiedSince = lastModifiedSince;
        this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
        this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    }

    private ObjectConditionsArgs() {
        this.excludePrefixes = Codegen.empty();
        this.includePrefixes = Codegen.empty();
        this.lastModifiedBefore = Codegen.empty();
        this.lastModifiedSince = Codegen.empty();
        this.maxTimeElapsedSinceLastModification = Codegen.empty();
        this.minTimeElapsedSinceLastModification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> excludePrefixes;
        private @Nullable Output<List<String>> includePrefixes;
        private @Nullable Output<String> lastModifiedBefore;
        private @Nullable Output<String> lastModifiedSince;
        private @Nullable Output<String> maxTimeElapsedSinceLastModification;
        private @Nullable Output<String> minTimeElapsedSinceLastModification;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePrefixes = defaults.excludePrefixes;
    	      this.includePrefixes = defaults.includePrefixes;
    	      this.lastModifiedBefore = defaults.lastModifiedBefore;
    	      this.lastModifiedSince = defaults.lastModifiedSince;
    	      this.maxTimeElapsedSinceLastModification = defaults.maxTimeElapsedSinceLastModification;
    	      this.minTimeElapsedSinceLastModification = defaults.minTimeElapsedSinceLastModification;
        }

        public Builder excludePrefixes(@Nullable Output<List<String>> excludePrefixes) {
            this.excludePrefixes = excludePrefixes;
            return this;
        }
        public Builder excludePrefixes(@Nullable List<String> excludePrefixes) {
            this.excludePrefixes = Codegen.ofNullable(excludePrefixes);
            return this;
        }
        public Builder excludePrefixes(String... excludePrefixes) {
            return excludePrefixes(List.of(excludePrefixes));
        }
        public Builder includePrefixes(@Nullable Output<List<String>> includePrefixes) {
            this.includePrefixes = includePrefixes;
            return this;
        }
        public Builder includePrefixes(@Nullable List<String> includePrefixes) {
            this.includePrefixes = Codegen.ofNullable(includePrefixes);
            return this;
        }
        public Builder includePrefixes(String... includePrefixes) {
            return includePrefixes(List.of(includePrefixes));
        }
        public Builder lastModifiedBefore(@Nullable Output<String> lastModifiedBefore) {
            this.lastModifiedBefore = lastModifiedBefore;
            return this;
        }
        public Builder lastModifiedBefore(@Nullable String lastModifiedBefore) {
            this.lastModifiedBefore = Codegen.ofNullable(lastModifiedBefore);
            return this;
        }
        public Builder lastModifiedSince(@Nullable Output<String> lastModifiedSince) {
            this.lastModifiedSince = lastModifiedSince;
            return this;
        }
        public Builder lastModifiedSince(@Nullable String lastModifiedSince) {
            this.lastModifiedSince = Codegen.ofNullable(lastModifiedSince);
            return this;
        }
        public Builder maxTimeElapsedSinceLastModification(@Nullable Output<String> maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
            return this;
        }
        public Builder maxTimeElapsedSinceLastModification(@Nullable String maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = Codegen.ofNullable(maxTimeElapsedSinceLastModification);
            return this;
        }
        public Builder minTimeElapsedSinceLastModification(@Nullable Output<String> minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
            return this;
        }
        public Builder minTimeElapsedSinceLastModification(@Nullable String minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = Codegen.ofNullable(minTimeElapsedSinceLastModification);
            return this;
        }        public ObjectConditionsArgs build() {
            return new ObjectConditionsArgs(excludePrefixes, includePrefixes, lastModifiedBefore, lastModifiedSince, maxTimeElapsedSinceLastModification, minTimeElapsedSinceLastModification);
        }
    }
}
