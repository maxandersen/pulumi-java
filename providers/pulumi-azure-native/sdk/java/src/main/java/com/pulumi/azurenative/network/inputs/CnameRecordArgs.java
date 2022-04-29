// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CNAME record.
 * 
 */
public final class CnameRecordArgs extends ResourceArgs {

    public static final CnameRecordArgs Empty = new CnameRecordArgs();

    /**
     * The canonical name for this CNAME record.
     * 
     */
    @Import(name="cname")
    private @Nullable Output<String> cname;

    /**
     * @return The canonical name for this CNAME record.
     * 
     */
    public Optional<Output<String>> cname() {
        return Optional.ofNullable(this.cname);
    }

    private CnameRecordArgs() {}

    private CnameRecordArgs(CnameRecordArgs $) {
        this.cname = $.cname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CnameRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CnameRecordArgs $;

        public Builder() {
            $ = new CnameRecordArgs();
        }

        public Builder(CnameRecordArgs defaults) {
            $ = new CnameRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cname The canonical name for this CNAME record.
         * 
         * @return builder
         * 
         */
        public Builder cname(@Nullable Output<String> cname) {
            $.cname = cname;
            return this;
        }

        /**
         * @param cname The canonical name for this CNAME record.
         * 
         * @return builder
         * 
         */
        public Builder cname(String cname) {
            return cname(Output.of(cname));
        }

        public CnameRecordArgs build() {
            return $;
        }
    }

}
