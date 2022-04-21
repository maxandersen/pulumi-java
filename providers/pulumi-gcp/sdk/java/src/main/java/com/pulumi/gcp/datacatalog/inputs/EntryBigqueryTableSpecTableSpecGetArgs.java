// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecTableSpecGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecTableSpecGetArgs Empty = new EntryBigqueryTableSpecTableSpecGetArgs();

    @Import(name="groupedEntry")
    private @Nullable Output<String> groupedEntry;

    public Optional<Output<String>> groupedEntry() {
        return Optional.ofNullable(this.groupedEntry);
    }

    private EntryBigqueryTableSpecTableSpecGetArgs() {}

    private EntryBigqueryTableSpecTableSpecGetArgs(EntryBigqueryTableSpecTableSpecGetArgs $) {
        this.groupedEntry = $.groupedEntry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryBigqueryTableSpecTableSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryBigqueryTableSpecTableSpecGetArgs $;

        public Builder() {
            $ = new EntryBigqueryTableSpecTableSpecGetArgs();
        }

        public Builder(EntryBigqueryTableSpecTableSpecGetArgs defaults) {
            $ = new EntryBigqueryTableSpecTableSpecGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupedEntry(@Nullable Output<String> groupedEntry) {
            $.groupedEntry = groupedEntry;
            return this;
        }

        public Builder groupedEntry(String groupedEntry) {
            return groupedEntry(Output.of(groupedEntry));
        }

        public EntryBigqueryTableSpecTableSpecGetArgs build() {
            return $;
        }
    }

}
