// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetArchiveArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetArchiveArgs Empty = new GetArchiveArgs();

    @Import(name="archiveName", required=true)
    private String archiveName;

    public String archiveName() {
        return this.archiveName;
    }

    private GetArchiveArgs() {}

    private GetArchiveArgs(GetArchiveArgs $) {
        this.archiveName = $.archiveName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetArchiveArgs $;

        public Builder() {
            $ = new GetArchiveArgs();
        }

        public Builder(GetArchiveArgs defaults) {
            $ = new GetArchiveArgs(Objects.requireNonNull(defaults));
        }

        public Builder archiveName(String archiveName) {
            $.archiveName = archiveName;
            return this;
        }

        public GetArchiveArgs build() {
            $.archiveName = Objects.requireNonNull($.archiveName, "expected parameter 'archiveName' to be non-null");
            return $;
        }
    }

}
