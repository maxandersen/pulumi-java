// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the UnknownTarget
 * 
 */
public final class UnknownTargetResponse extends com.pulumi.resources.InvokeArgs {

    public static final UnknownTargetResponse Empty = new UnknownTargetResponse();

    /**
     * Dictionary of string-&gt;string pairs containing information about the Storage Target.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Map<String,String> attributes;

    public Map<String,String> attributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }

    public UnknownTargetResponse(@Nullable Map<String,String> attributes) {
        this.attributes = attributes;
    }

    private UnknownTargetResponse() {
        this.attributes = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UnknownTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(UnknownTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }        public UnknownTargetResponse build() {
            return new UnknownTargetResponse(attributes);
        }
    }
}
