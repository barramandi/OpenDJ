/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at legal-notices/CDDLv1_0.txt
 * or http://forgerock.org/license/CDDLv1.0.html.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at legal-notices/CDDLv1_0.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Copyright 2015 ForgeRock AS
 */
package org.opends.server.backends.jeb;

import org.opends.legacy.DummyByteArrayComparator;

/**
 * Required by rebuild-index process when upgrading to OpenDJ3.
 *
 * @deprecated since OPENDJ-1591 Migrate matching rules
 * @deprecated since OPENDJ-2337 Remove old JE local-db backend code and JE changelog
 */
@Deprecated
public class VLVKeyComparator extends DummyByteArrayComparator {
    private static final long serialVersionUID = 1585167927344130604L;

    @Override
    public int compare(byte[] b1, byte[] b2) {
        return 0;
    }
}