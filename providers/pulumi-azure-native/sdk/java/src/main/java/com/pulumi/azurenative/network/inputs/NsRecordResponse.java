// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An NS record.
 * 
 */
public final class NsRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final NsRecordResponse Empty = new NsRecordResponse();

    /**
     * The name server name for this NS record.
     * 
     */
    @Import(name="nsdname")
      private final @Nullable String nsdname;

    public Optional<String> nsdname() {
        return this.nsdname == null ? Optional.empty() : Optional.ofNullable(this.nsdname);
    }

    public NsRecordResponse(@Nullable String nsdname) {
        this.nsdname = nsdname;
    }

    private NsRecordResponse() {
        this.nsdname = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nsdname;

        public Builder() {
    	      // Empty
        }

        public Builder(NsRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nsdname = defaults.nsdname;
        }

        public Builder nsdname(@Nullable String nsdname) {
            this.nsdname = nsdname;
            return this;
        }        public NsRecordResponse build() {
            return new NsRecordResponse(nsdname);
        }
    }
}
