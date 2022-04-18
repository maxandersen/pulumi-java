// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A transformation object, containing all information associated with the named transformation. All transformations are contained under a streaming job.
 * 
 */
public final class TransformationResponse extends com.pulumi.resources.InvokeArgs {

    public static final TransformationResponse Empty = new TransformationResponse();

    /**
     * The current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="query")
      private final @Nullable String query;

    public Optional<String> query() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    /**
     * Specifies the number of streaming units that the streaming job uses.
     * 
     */
    @Import(name="streamingUnits")
      private final @Nullable Integer streamingUnits;

    public Optional<Integer> streamingUnits() {
        return this.streamingUnits == null ? Optional.empty() : Optional.ofNullable(this.streamingUnits);
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public TransformationResponse(
        String etag,
        String id,
        @Nullable String name,
        @Nullable String query,
        @Nullable Integer streamingUnits,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = name;
        this.query = query;
        this.streamingUnits = streamingUnits;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TransformationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.query = null;
        this.streamingUnits = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String name;
        private @Nullable String query;
        private @Nullable Integer streamingUnits;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.streamingUnits = defaults.streamingUnits;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = query;
            return this;
        }
        public Builder streamingUnits(@Nullable Integer streamingUnits) {
            this.streamingUnits = streamingUnits;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TransformationResponse build() {
            return new TransformationResponse(etag, id, name, query, streamingUnits, type);
        }
    }
}
